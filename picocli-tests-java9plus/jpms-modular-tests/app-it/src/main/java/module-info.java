module picocli.test_jpms.modular_app.it {
    requires picocli.test_jpms.modular_app;
    requires system.lambda; // for test
//    requires org.junit.jupiter;
}
