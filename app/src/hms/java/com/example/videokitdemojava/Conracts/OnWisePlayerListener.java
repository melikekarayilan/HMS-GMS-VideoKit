package com.example.videokitdemojava.Conracts;

import android.widget.SeekBar;

import com.huawei.hms.videokit.player.WisePlayer;

public interface OnWisePlayerListener  extends WisePlayer.ErrorListener, WisePlayer.ReadyListener,
        WisePlayer.EventListener, WisePlayer.PlayEndListener, WisePlayer.ResolutionUpdatedListener,
        WisePlayer.SeekEndListener, WisePlayer.LoadingListener, SeekBar.OnSeekBarChangeListener {
}