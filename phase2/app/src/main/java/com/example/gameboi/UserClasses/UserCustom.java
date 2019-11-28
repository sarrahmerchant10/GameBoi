package com.example.gameboi.UserClasses;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

class UserCustom implements Parcelable {

    /**
     * The User's name
     */
    private String name;

    /**
     * The User's background screen colour
     */
    private int backgroundColor;

    /**
     * The User's chosen avatar icon
     */
    private String icon; //string icon

    /**
     * The User's chosen game difficulty
     */
    private String difficulty;

    UserCustom(String name, int backgroundColor, String icon, String difficulty){
        this.name = name;
        this.backgroundColor = backgroundColor;
        this.icon = icon;
        this.difficulty = difficulty;
    }

    protected UserCustom(Parcel in) {
        name = in.readString();
        backgroundColor = in.readInt();
        icon = in.readString();
        difficulty = in.readString();
    }

    public static final Creator<UserCustom> CREATOR = new Creator<UserCustom>() {
        @Override
        public UserCustom createFromParcel(Parcel in) {
            return new UserCustom(in);
        }

        @Override
        public UserCustom[] newArray(int size) {
            return new UserCustom[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(backgroundColor);
        parcel.writeString(icon);
        parcel.writeString(difficulty);
    }

    /**
     * @return The users set name
     */
    String getName() {
        return name;
    }

    /**
     * @param name set the User objects name
     */
    void setName(String name) {
        this.name = name;
    }

    /**
     * @return get the background color
     */
    int getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * @param backgroundColor set a new background color
     */
    void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * @return the users icon
     */
    String getIcon() {
        return icon;
    }

    /**
     * @param icon a new user icon
     */
    void setIcon(String icon) {
        this.icon = icon;
    }


    /** Returns the User's difficulty of the game
     *
     * @return the User's game difficulty
     */
    String getDifficulty() { return this.difficulty; }

    /** Sets the User's game difficulty
     *
     * @param difficulty the difficulty of the game
     */
    void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
