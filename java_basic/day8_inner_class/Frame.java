interface ActionListener {
    public void actionPerformed();
}

class ActionHandler {
    ActionListener al;

    ActionHandler(ActionListener al) {
        this.al = al;
    }

    void process() {
        al.actionPerformed();
    }
}


class PlayMusicAction implements ActionListener {
    public void actionPerform() {
        //�������¶���Ҫ�ɵ����顣ֻҪ������������塣
        System.out.println("Play music");
    }
}

class Button {
    ActionListener als;

    void addListener(ActionListener al) {
        this.als = al;
    }

    void processEvent() {
        als.actionPerform();
    }
}

class Frame {
    public static void main(String[] args) {
        ActionListener action = new PlayMusicAction();
        Button bu = new Button();
        bu.addListener(action);
    }
}