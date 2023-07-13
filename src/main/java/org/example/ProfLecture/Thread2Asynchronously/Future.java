package org.example.ProfLecture.Thread2Asynchronously;

import java.util.concurrent.ExecutionException;

public interface Future <T>{
    T get() throws InterruptedException, ExecutionException;
}
