package behavorial.visitor.object_siralization.shapes;

import behavorial.visitor.object_siralization.visitor.Visitor;

public interface Shape {
    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}
