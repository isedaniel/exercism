class Triangle {
    private final double s1;
    private final double s2;
    private final double s3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if ((side1 == 0 || side2 == 0 || side3 == 0) || 
            (side1 + side2 < side3) || 
            (side2 + side3 < side1) || 
            (side3 + side1 < side2)) 
            throw new TriangleException();

        s1 = side1;
        s2 = side2;
        s3 = side3;
        
    }

    boolean isEquilateral() {
        return (s1 == s2) && (s2 == s3) && (s3 == s1);
    }

    boolean isIsosceles() {
        return (s1 == s2) || (s2 == s3) || (s3 == s1);
    }

    boolean isScalene() {
        return (s1 != s2) && (s2 != s3) && (s3 != s1);
    }

}
