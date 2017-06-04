class A {
    interface B {
        void g();
    }
}

class C {
    class D implements A.B {
        public void g() {
        }
    }
}
