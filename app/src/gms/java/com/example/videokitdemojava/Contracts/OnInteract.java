package com.example.videokitdemojava.Contracts;


public interface OnInteract {
    void shareUri(String uri);

    void initDialog();

    void bindDialogInfo(String vUrl, String vSender, String vSenderID, String vLovely);

    void bindInformativeDialog();

    void readyPlayer(String videoUrl, String name);

    void releasePlayer();

    void initUI(Integer type);
}