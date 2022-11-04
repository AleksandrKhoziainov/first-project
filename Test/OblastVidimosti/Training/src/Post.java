class Note {
    public void setLabel(String label) {
        this.label = label;
    }

    public String label;
    public String text;

    @Override
    public String toString() {
        return "Note{label='" + label + "',text.length=" + text.length() + "}";
    }
    System.out.println(note1.toString());
}
