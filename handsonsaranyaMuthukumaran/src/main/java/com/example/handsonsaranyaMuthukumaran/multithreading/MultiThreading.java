package com.example.handsonsaranyaMuthukumaran.multithreading;
/*what is multithreading?Thread?Lifecycleofthread?ways to create thread?keywords?Example with explanations?
* Multithreading in Java is a process of executing multiple threads simultaneously.
*thread-A thread is a lightweight sub-process, the smallest unit of processing.
* ----------------------------------------------------
*In Java, a thread always exists in any one of the following states. These states are:
New- 1. Whenever a new thread is created, it is always in the new state.2
Active-When a thread invokes the start() method, it moves from the new state to the active state.
Blocked / Waiting- Whenever a thread is inactive for a span of time (not permanently) then, either the thread is in the blocked state or is in the waiting state.
Terminated-A thread reaches the termination state because of the following reasons:
When a thread has finished its job, then it exists or terminates normally.
Abnormal termination: It occurs when some unusual events such as an unhandled exception or segmentation fault.
* ----------------------------------
*using Thread class (java.lang)
* Using Runnable interface (java.lang)
*using Callable interface (java.util.concurrent)
*using ExecutorService framework
*using Completable feature
* --------------------------------------------------------
*keywords-static, volatile, synchronized , AtomicReference(class), ThreadLocal(class)
* static
*
* Example with explanations-System execution,cricket score update
* */
public class MultiThreading {

    public static void main(String[] args){





    }
}
