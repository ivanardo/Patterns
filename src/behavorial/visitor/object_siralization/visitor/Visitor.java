package behavorial.visitor.object_siralization.visitor;

import behavorial.visitor.object_siralization.shapes.Circle;
import behavorial.visitor.object_siralization.shapes.CompoundShape;
import behavorial.visitor.object_siralization.shapes.Dot;
import behavorial.visitor.object_siralization.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectange);

    String visitCompoundGraphic(CompoundShape cg);
}

