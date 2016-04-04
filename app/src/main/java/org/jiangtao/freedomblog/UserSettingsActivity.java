package org.jiangtao.freedomblog;

import android.support.v4.app.Fragment;
import com.smartydroid.android.starter.kit.app.SimpleSinglePaneActivity;
import org.jiangtao.fragment.UserSettingFragment;

/**
 * 设置用户信息
 */
public class UserSettingsActivity extends SimpleSinglePaneActivity {

  @Override protected Fragment onCreatePane() {
    return UserSettingFragment.create();
  }
}
