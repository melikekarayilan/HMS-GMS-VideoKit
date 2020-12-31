package com.example.videokitdemojava.Conracts;


public interface OnPlaySettingListener {
    /**
     * Dialog select listener
     *
     * @param itemSelect The selected text
     * @param settingType The corresponding operation type of player
     */
    void onSettingItemClick(String itemSelect, int settingType);
}

