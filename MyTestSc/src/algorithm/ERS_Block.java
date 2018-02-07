package algorithm;

import java.awt.*;
import java.awt.event.*;
import java.io.UnsupportedEncodingException;

/**
 * 俄罗斯方块（上下左右、空格旋转）
 *
 */
public class ERS_Block extends Frame {
    private static final long serialVersionUID = 1L;

    public static boolean isPlay = false;
    public static int level = 1, score = 0;
    public static TextField scoreField, levelField;

    public static MyTimer timer;
    GameCanvas gameScr;

    public static void main(String[] argus) throws HeadlessException, UnsupportedEncodingException {
        ERS_Block ers = new ERS_Block("俄罗斯块游戏 V1.0 Author:Vincent");
        WindowListener win_listener = new WinListener();
        ers.addWindowListener(win_listener);
    }

    // 俄罗斯块类构造
    @SuppressWarnings("deprecation")
    ERS_Block(String title) throws HeadlessException, UnsupportedEncodingException {
        super(title);

        setSize(600, 480);
        setLayout(new GridLayout(1, 2));

        gameScr = new GameCanvas();
        gameScr.addKeyListener(gameScr);

        timer = new MyTimer(gameScr);
        timer.setDaemon(true);
        timer.start();
        timer.suspend();

        add(gameScr);

        Panel rightScr = new Panel();
        rightScr.setLayout(new GridLayout(2, 1, 0, 30));
        rightScr.setSize(120, 500);
        add(rightScr);

        // 右边信息窗体布局
        MyPanel infoScr = new MyPanel();
        infoScr.setLayout(new GridLayout(4, 1, 0, 5));
        infoScr.setSize(120, 300);
        rightScr.add(infoScr);

        // 定义标签初始值
        Label scorep = new Label("score: ", Label.LEFT);
        Label levelp = new Label("level: ", Label.LEFT);
        scoreField = new TextField(8);
        levelField = new TextField(8);
        scoreField.setEditable(false);
        levelField.setEditable(false);
        infoScr.add(scorep);
        infoScr.add(scoreField);
        infoScr.add(levelp);
        infoScr.add(levelField);
        scorep.setSize(new Dimension(20, 60));
        scoreField.setSize(new Dimension(20, 60));
        levelp.setSize(new Dimension(20, 60));
        levelField.setSize(new Dimension(20, 60));
        scoreField.setText("0");
        levelField.setText("1");

        // 右边控制按钮窗体布局
        MyPanel controlScr = new MyPanel();
        controlScr.setLayout(new GridLayout(5, 1, 0, 5));
        rightScr.add(controlScr);

        // 定义按钮play
        Button play_b = new Button("start game");
        play_b.setSize(new Dimension(50, 200));
        play_b.addActionListener(new Command(Command.button_play, gameScr));

        // 定义按钮Level UP
        Button level_up_b = new Button("up level");
        level_up_b.setSize(new Dimension(50, 200));
        level_up_b.addActionListener(new Command(Command.button_levelup, gameScr));

        // 定义按钮Level Down
        Button level_down_b = new Button("low level");
        level_down_b.setSize(new Dimension(50, 200));
        level_down_b.addActionListener(new Command(Command.button_leveldown, gameScr));

        // 定义按钮Level Pause
        Button pause_b = new Button("pause");
        pause_b.setSize(new Dimension(50, 200));
        pause_b.addActionListener(new Command(Command.button_pause, gameScr));

        // 定义按钮Quit
        Button quit_b = new Button("exit");
        quit_b.setSize(new Dimension(50, 200));
        quit_b.addActionListener(new Command(Command.button_quit, gameScr));

        controlScr.add(play_b);
        controlScr.add(level_up_b);
        controlScr.add(level_down_b);
        controlScr.add(pause_b);
        controlScr.add(quit_b);
        setVisible(true);
        gameScr.requestFocus();
    }
}

// 重写MyPanel类使Panel四周留空间
class MyPanel extends Panel {
    private static final long serialVersionUID = 1L;

    public Insets getInsets() {
        return new Insets(30, 50, 30, 50);
    }
}

// 游戏画布类
class GameCanvas extends Canvas implements KeyListener {
    private static final long serialVersionUID = 1L;

    final int unitSize = 30; // 块边
    int rowNum; // 格行数
    int columnNum; // 格列数
    int maxAllowRowNum; // 允许少行未削
    int blockInitRow; // 新现块起始行坐标
    int blockInitCol; // 新现块起始列坐标
    int[][] scrArr; // 屏幕数组
    Block b; // 快引用

    // 画布类构造
    GameCanvas() {
        rowNum = 15;
        columnNum = 10;
        maxAllowRowNum = rowNum - 2;
        b = new Block(this);
        blockInitRow = rowNum - 1;
        blockInitCol = columnNum / 2 - 2;
        scrArr = new int[32][32];
    }

    // 初始化屏幕并屏幕数组清零
    void initScr() {
        for (int i = 0; i < rowNum; i++)
            for (int j = 0; j < columnNum; j++)
                scrArr[i][j] = 0;
        b.reset();
        repaint();
    }

    // 重新刷新画布
    public void paint(Graphics g) {
        for (int i = 0; i < rowNum; i++)
            for (int j = 0; j < columnNum; j++)
                drawUnit(i, j, scrArr[i][j]);
    }

    // 画块
    public void drawUnit(int row, int col, int type) {
        scrArr[row][col] = type;
        Graphics g = getGraphics();
        switch (type) { // 表示画快
        case 0:
            g.setColor(Color.black);
            break; // 背景颜色画
        case 1:
            g.setColor(Color.blue);
            break; // 画落块
        case 2:
            g.setColor(Color.magenta);
            break; // 画已经落
        }
        g.fill3DRect(col * unitSize, getSize().height - (row + 1) * unitSize, unitSize, unitSize, true);
        g.dispose();
    }

    public Block getBlock() {
        return b; // 返block实例引用
    }

    // 返屏幕数组(row,col)位置属性值
    public int getScrArrXY(int row, int col) {
        if (row < 0 || row >= rowNum || col < 0 || col >= columnNum)
            return (-1);
        else
            return (scrArr[row][col]);
    }

    // 返新块初始行坐标
    public int getInitRow() {
        return (blockInitRow); // 返新块初始行坐标
    }

    // 返新块初始列坐标
    public int getInitCol() {
        return (blockInitCol); // 返新块初始列坐标
    }

    // 满行删除
    void deleteFullLine() {
        int full_line_num = 0;
        int k = 0;
        for (int i = 0; i < rowNum; i++) {
            boolean isfull = true;

            L1: for (int j = 0; j < columnNum; j++)
                if (scrArr[i][j] == 0) {
                    k++;
                    isfull = false;
                    break L1;
                }
            if (isfull)
                full_line_num++;
            if (k != 0 && k - 1 != i && !isfull)
                for (int j = 0; j < columnNum; j++) {
                    if (scrArr[i][j] == 0)
                        drawUnit(k - 1, j, 0);
                    else
                        drawUnit(k - 1, j, 2);
                    scrArr[k - 1][j] = scrArr[i][j];
                }
        }
        for (int i = k - 1; i < rowNum; i++) {
            for (int j = 0; j < columnNum; j++) {
                drawUnit(i, j, 0);
                scrArr[i][j] = 0;
            }
        }
        ERS_Block.score += full_line_num;
        ERS_Block.scoreField.setText("" + ERS_Block.score);
    }

    // 判断游戏否结束
    boolean isGameEnd() {
        for (int col = 0; col < columnNum; col++) {
            if (scrArr[maxAllowRowNum][col] != 0)
                return true;
        }
        return false;
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    // 处理键盘输入
    public void keyPressed(KeyEvent e) {
        if (!ERS_Block.isPlay)
            return;
        switch (e.getKeyCode()) {
        case KeyEvent.VK_DOWN:
            b.fallDown();
            break;
        case KeyEvent.VK_LEFT:
            b.leftMove();
            break;
        case KeyEvent.VK_RIGHT:
            b.rightMove();
            break;
        case KeyEvent.VK_SPACE:
            b.leftTurn();
            break;
        }
    }
}

// 处理控制类
class Command implements ActionListener {
    static final int button_play = 1; // 给按钮配编号
    static final int button_levelup = 2;
    static final int button_leveldown = 3;
    static final int button_quit = 4;
    static final int button_pause = 5;
    static boolean pause_resume = true;

    int curButton; // 前按钮
    GameCanvas scr;

    // 控制按钮类构造
    Command(int button, GameCanvas scr) {
        curButton = button;
        this.scr = scr;
    }

    // 按钮执行
    @SuppressWarnings("deprecation")
    public void actionPerformed(ActionEvent e) {
        switch (curButton) {
        case button_play:
            if (!ERS_Block.isPlay) {
                scr.initScr();
                ERS_Block.isPlay = true;
                ERS_Block.score = 0;
                ERS_Block.scoreField.setText("0");
                ERS_Block.timer.resume();
            }
            scr.requestFocus();
            break;
        case button_levelup:
            if (ERS_Block.level < 10) {
                ERS_Block.level++;
                ERS_Block.levelField.setText("" + ERS_Block.level);
                ERS_Block.score = 0;
                ERS_Block.scoreField.setText("" + ERS_Block.score);
            }
            scr.requestFocus();
            break;
        case button_leveldown:
            if (ERS_Block.level > 1) {
                ERS_Block.level--;
                ERS_Block.levelField.setText("" + ERS_Block.level);
                ERS_Block.score = 0;
                ERS_Block.scoreField.setText("" + ERS_Block.score);
            }
            scr.requestFocus();
            break;
        case button_pause:
            if (pause_resume) {
                ERS_Block.timer.suspend();
                pause_resume = false;
            } else {
                ERS_Block.timer.resume();
                pause_resume = true;
            }
            scr.requestFocus();
            break;
        case button_quit:
            System.exit(0);
        }
    }
}

// 块类
class Block {
    static int[][] pattern = { { 0x0f00, 0x4444, 0x0f00, 0x4444 }, // 用十六进至表示本行表示条四种状态
            { 0x04e0, 0x0464, 0x00e4, 0x04c4 }, { 0x4620, 0x6c00, 0x4620, 0x6c00 }, { 0x2640, 0xc600, 0x2640, 0xc600 },
            { 0x6220, 0x1700, 0x2230, 0x0740 }, { 0x6440, 0x0e20, 0x44c0, 0x8e00 },
            { 0x0660, 0x0660, 0x0660, 0x0660 } };
    int blockType; // 块模式号（0-6）
    int turnState; // 块翻转状态（0-3）
    int blockState; // 快落状态
    int row, col; // 块画布坐标
    GameCanvas scr;

    // 块类构造
    Block(GameCanvas scr) {
        this.scr = scr;
        blockType = (int) (Math.random() * 1000) % 7;
        turnState = (int) (Math.random() * 1000) % 4;
        blockState = 1;
        row = scr.getInitRow();
        col = scr.getInitCol();
    }

    // 重新初始化块并显示新块
    public void reset() {
        blockType = (int) (Math.random() * 1000) % 7;
        turnState = (int) (Math.random() * 1000) % 4;
        blockState = 1;
        row = scr.getInitRow();
        col = scr.getInitCol();
        dispBlock(1);
    }

    // 实现块翻转
    public void leftTurn() {
        if (assertValid(blockType, (turnState + 1) % 4, row, col)) {
            dispBlock(0);
            turnState = (turnState + 1) % 4;
            dispBlock(1);
        }
    }

    // 实现块左移
    public void leftMove() {
        if (assertValid(blockType, turnState, row, col - 1)) {
            dispBlock(0);
            col--;
            dispBlock(1);
        }
    }

    // 实现块右移
    public void rightMove() {
        if (assertValid(blockType, turnState, row, col + 1)) {
            dispBlock(0);
            col++;
            dispBlock(1);
        }
    }

    // 实现块落操作
    public boolean fallDown() {
        if (blockState == 2)
            return (false);
        if (assertValid(blockType, turnState, row - 1, col)) {
            dispBlock(0);
            row--;
            dispBlock(1);
            return (true);
        } else {
            blockState = 2;
            dispBlock(2);
            return (false);
        }
    }

    // 判断否确
    boolean assertValid(int t, int s, int row, int col) {
        int k = 0x8000;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((int) (pattern[t][s] & k) != 0) {
                    int temp = scr.getScrArrXY(row - i, col + j);
                    if (temp < 0 || temp == 2)
                        return false;
                }
                k = k >> 1;
            }
        }
        return true;
    }

    // 同步显示
    public synchronized void dispBlock(int s) {
        int k = 0x8000;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (((int) pattern[blockType][turnState] & k) != 0) {
                    scr.drawUnit(row - i, col + j, s);
                }
                k = k >> 1;
            }
        }
    }
}

// 定线程
class MyTimer extends Thread {
    GameCanvas scr;

    public MyTimer(GameCanvas scr) {
        this.scr = scr;
    }

    @SuppressWarnings("deprecation")
    public void run() {
        while (true) {
            try {
                sleep((10 - ERS_Block.level + 1) * 100);
            } catch (InterruptedException e) {
            }
            if (!scr.getBlock().fallDown()) {
                scr.deleteFullLine();
                if (scr.isGameEnd()) {
                    ERS_Block.isPlay = false;
                    suspend();
                } else
                    scr.getBlock().reset();
            }
        }
    }
}

class WinListener extends WindowAdapter {
    public void windowClosing(WindowEvent l) {
        System.exit(0);
    }
}
