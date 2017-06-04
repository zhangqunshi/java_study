//: appendixb:MsgImpl.cpp
//# Tested with VC++ & BC++. Include path must
//# be adjusted to find the JNI headers. 

#include <jni.h>
#include <stdio.h>
#include "ShowMessage.h"

extern "C" JNIEXPORT void JNICALL 
Java_ShowMessage_ShowMessage(JNIEnv* env, jobject, jstring jMsg) {
    const char* msg = env->GetStringUTFChars(jMsg,0);
    printf("Hello world, JNI: %s\n", msg);
    env->ReleaseStringUTFChars(jMsg, msg);
}