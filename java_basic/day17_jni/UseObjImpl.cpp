//# Tested with VC++ & BC++. Include path must
//# be adjusted to find the JNI headers.

#include <jni.h>
extern "C" JNIEXPORT void JNICALL 
Java_UseObjects_changeObject(JNIEnv* env, jobject, jobject obj) {

    jclass cls = env->GetObjectClass(obj);
    jfieldID fid = env->GetFieldID(cls, "aValue", "I");
    jmethodID mid = env->GetMethodID(cls, "divByTwo", "()V");

    int value = env->GetIntField(obj, fid);
    printf("Native: %d\n", value);

    env->SetIntField(obj, fid, 6);
    env->CallVoidMethod(obj, mid);
    value = env->GetIntField(obj, fid);
    printf("Native: %d\n", value);
}