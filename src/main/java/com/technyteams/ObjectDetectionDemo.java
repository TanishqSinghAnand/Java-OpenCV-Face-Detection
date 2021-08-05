package com.technyteams;

import org.opencv.core.Core;

public class ObjectDetectionDemo {
    static {System.loadLibrary(Core.NATIVE_LIBRARY_NAME);}
    public static void main(String[] args) {
        // Load the native OpenCV library

        new ObjectDetection().run(args);
    }
}