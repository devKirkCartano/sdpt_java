package test;

class Rectangle {
    private int length;
    private int breadth;
    public Rectangle(int side) {
        length = side;
        breadth = side; }
    public Rectangle(int l, int b) {
        length = l;
        breadth = b; }
    public int getArea() {
        return length * breadth; }
}
