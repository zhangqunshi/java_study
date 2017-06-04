//: c08:RandVals.java
// Initializing interface fields with
// non-constant initializers.

interface RandVals {
    int rint = (int) (Math.random() * 10);

    long rlong = (long) (Math.random() * 10);

    float rfloat = (float) (Math.random() * 10);

    double rdouble = Math.random() * 10;
}