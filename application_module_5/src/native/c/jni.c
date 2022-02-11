#include "de_doubleslash_demo_coverage_module_five_JniWrapper.h"
#include <stdio.h>

#define STRING_RETURN "Hello world!"
#define STRING_CALLBACK "Hello world callback!"
#define STRING_CALLBACK_STATIC "Hello world static callback!"
#define STRING_PAYLOAD "Simple payload string"

JNIEXPORT jstring JNICALL Java_de_doubleslash_demo_coverage_module_five_JniWrapper_getString(JNIEnv *env, jobject thiz) {
    jclass cls_foo = (*env)->GetObjectClass(env, thiz);
    jmethodID callback = (*env)->GetMethodID(env, cls_foo, "callback", "(Ljava/lang/String;)V");
    jmethodID callbackWithObject = (*env)->GetMethodID(env, cls_foo, "callbackObject", "(Ljava/util/List;)Ljava/lang/String;");
    jmethodID callbackStatic = (*env)->GetStaticMethodID(env, cls_foo, "callbackStatic", "(Ljava/lang/String;)V");
    jstring jStringRegular = (*env)->NewStringUTF(env, STRING_CALLBACK);
    jstring jStringStatic = (*env)->NewStringUTF(env, STRING_CALLBACK_STATIC);
    (*env)->CallVoidMethod(env, thiz, callback, jStringRegular);
    (*env)->CallStaticVoidMethod(env, thiz, callbackStatic, jStringStatic);
    (*env)->DeleteLocalRef(env, jStringRegular);
    (*env)->DeleteLocalRef(env, jStringStatic);
    jclass cls = (*env)->FindClass(env, "java/util/ArrayList");
    jmethodID constructor = (*env)->GetMethodID(env, cls, "<init>", "()V");
    jobject arraylist = (*env)->NewObject(env, cls, constructor);
    jstring jStringPayload = (*env)->NewStringUTF(env, STRING_PAYLOAD);
    jmethodID addMethod = (*env)->GetMethodID(env, cls, "add", "(Ljava/lang/Object;)Z");
    (*env)->CallBooleanMethod(env, arraylist, addMethod, jStringPayload);
    jobject resultString = (*env)->CallObjectMethod(env, thiz, callbackWithObject, arraylist);
    const char* str = (*env)->GetStringUTFChars(env, (jstring) resultString, NULL);
    printf(str);
    (*env)->ReleaseStringUTFChars(env, resultString, str);
    (*env)->DeleteLocalRef(env, jStringPayload);
    (*env)->DeleteLocalRef(env, arraylist);
    if (0 == 0) {
        printf("Yay\n");
    } else {
        printf("Nay\n");
    }
    return (*env)->NewStringUTF(env, STRING_RETURN);
}
