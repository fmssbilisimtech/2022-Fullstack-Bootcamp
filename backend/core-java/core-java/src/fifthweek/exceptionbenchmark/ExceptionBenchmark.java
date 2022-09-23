//package fifthweek.exceptionbenchmark;
//
//public class ExceptionBenchmark {
//
//    private static final int NUM_TRIES = 1000000;
//    private static final int NUM_TO_SEC = 1000;
//    public static void main(String[] args) {
//
//        double numIterations = 10;
//
//        long exceptionPlusCatchTime = 0, excepTime = 0, strTime = 0, throwTime = 0, stackTraceTime = 0;
//
//        for (int i = 0; i < numIterations; i++) {
//            exceptionPlusCatchTime += exceptionPlusCatchBlock() / NUM_TO_SEC;
//            excepTime += createException() / NUM_TO_SEC;
//            throwTime += catchBlock() / NUM_TO_SEC;
//            strTime += createString() / NUM_TO_SEC;
//            stackTraceTime += exceptionPlusStackTrace() / NUM_TO_SEC;
//        }
//
//        System.out.println("new Exception + throw/catch = " + exceptionPlusCatchTime / numIterations);
//        System.out.println("new Exception only          = " + excepTime / numIterations);
//        System.out.println("throw/catch only            = " + throwTime / numIterations);
//        System.out.println("new String (benchmark)      = " + strTime / numIterations);
//        System.out.println("new Exception + throw/catch + stackTrace = " + stackTraceTime / numIterations);
//    }
//
//    private static long exceptionPlusCatchBlock() {
//        long start = System.nanoTime();
//        for (int i = 0; i < NUM_TRIES; i++) {
//            try {
//                throw new Exception();
//            } catch (Exception e) {
//                // do nothing
//            }
//        }
//        long stop = System.nanoTime();
//        return stop - start;
//    }
//
//    private static long createException() {
//        long start = System.nanoTime();
//        for (int i = 0; i < NUM_TRIES; i++) {
//            Exception e = new Exception();
//        }
//        long stop = System.nanoTime();
//        return stop - start;
//    }
//
//    private static long exceptionPlusStackTrace() {
//        long start = System.nanoTime();
//        for (int i = 0; i < NUM_TRIES; i++) {
//            try{
//                int num = 5 / 0;
//            } catch (Throwable e) {
//                e.printStackTrace();
//            }
//        }
//        long stop = System.nanoTime();
//        return stop - start;
//    }
//
//    private static long createString() {
//        long start = System.nanoTime();
//        for (int i = 0; i < NUM_TRIES; i++) {
//            Object o = new String("" + i);
//        }
//        long stop = System.nanoTime();
//        return stop - start;
//    }
//
//    private static long catchBlock() {
//        Exception ex = new Exception(); //Instantiated here
//        long start = System.nanoTime();
//        for (int i = 0; i < NUM_TRIES; i++) {
//            try {
//                throw ex; //repeatedly thrown
//            } catch (Exception e) {
//                // do nothing
//            }
//        }
//        long stop = System.nanoTime();
//        return stop - start;
//    }
//
//}