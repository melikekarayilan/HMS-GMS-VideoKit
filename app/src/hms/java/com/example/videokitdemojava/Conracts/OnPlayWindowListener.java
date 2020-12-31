package com.example.videokitdemojava.Conracts;

import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;

import com.example.videokitdemojava.contract.OnItemClickListener;
import com.example.videokitdemojava.contract.OnPlaySettingListener;

public interface OnPlayWindowListener
        extends SurfaceHolder.Callback, View.OnClickListener, TextureView.SurfaceTextureListener, OnItemClickListener, OnPlaySettingListener {
}
