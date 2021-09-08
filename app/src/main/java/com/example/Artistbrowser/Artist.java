package com.example.Artistbrowser;

class Artist {

    private String mName;
    private String mDescription;
    private String mImage;
    private String mBLobId;

    public Artist(String Name, String Description, String Image,String id) {
        this.mName =Name;
        this.mDescription =Description;
        this.mImage =Image;
        this.mBLobId=id;
    }

    public String getmName() {
        return mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmImage() {
        return mImage;
    }

    public String getmBLobId() {
        return mBLobId;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "mName='" + mName + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mImage='" + mImage + '\'' +
                '}';
    }
}