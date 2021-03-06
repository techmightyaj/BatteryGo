package com.techmighty.batterygo.fragment;

import com.techmighty.batterygo.model.Time;
import com.techmighty.batterygo.util.SettingUtil;

/**
 * Created by ghostflying on 3/24/15.
 */
public class EndTimePicker extends BaseTimePickerDialog {
    @Override
    Time getTimeFromSetting() {
        return SettingUtil.getEndTime(getActivity());
    }

    @Override
    void setTimeToSetting(Time time) {
        SettingUtil.setEndTime(getActivity(), time);
    }
}
