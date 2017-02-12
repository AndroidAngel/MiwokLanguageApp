package com.teamandroidangel.iamangelauditor.miwoklanguage;

/**
 * Created by iamangelauditor on 1/28/17.
 */

public class Word {


     //Default translation for the word
    private String mDefaultTranslation;

    private int mAudioResourceId;

     //Miwok translation for the word
    private String mMiwokTranslation;

    private int mImageResourcesId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    //Create a new Word object
    //@param defaultTranslation is the word in a language that the user is already familiar with  (such as English)
    //@param miwokTranslation   is the word in the Miwok language

    public  Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourcesId = imageResourceId;
        mAudioResourceId = audioResourceId;

    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    //Get the default translation of the wo
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    //Get the Miwok translation of the word.
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getImageResourcesId() {
        return mImageResourcesId;
    }
    public boolean hasImage(){
        return mImageResourcesId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}