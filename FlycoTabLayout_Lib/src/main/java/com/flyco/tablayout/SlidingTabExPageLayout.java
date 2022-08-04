package com.flyco.tablayout;

import android.content.Context;
import android.util.AttributeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 滑动TabLayout,对于ViewPager的依赖性强
 */

/**
 * @author jin
 * 2022年8月4日
 * 不绑定ViewPager，
 */

public class SlidingTabExPageLayout extends SlidingTabLayoutBase {

  public SlidingTabExPageLayout(Context context) {
    super(context);
  }

  public SlidingTabExPageLayout(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public SlidingTabExPageLayout(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  public void setTabData(List<String> titles) {

    if (titles == null || titles.size() == 0) {
      throw new IllegalStateException("Titles can not be EMPTY !");
    }

    mTitles = new ArrayList<>();
    mTitles.addAll(titles);
    notifyDataSetChanged();
  }

  /** 设置titles数据的情况 */
  public void setTabData(String[] titles) {
    ArrayList<String> titleList = new ArrayList<>();
    Collections.addAll(titleList, titles);
    setTabData(titleList);
  }

  @Override
  public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    super.onPageScrolled(position, positionOffset, positionOffsetPixels);
  }

  //setter and getter
  @Override
  public void setCurrentTab(int currentTab) {
    setCurrentItem(currentTab);
  }

  @Override
  int getPageCount() {
    return mTitles.size();
  }

  @Override
  int getCurrentItem() {
    return this.mCurrentTab;
  }

  @Override
  void setCurrentItem(int position) {
    setCurrentItem(position, false);
  }

  @Override
  void setCurrentItem(int position, boolean smooth) {
    this.mCurrentTab = position;
    updateTabSelection(position);
    super.onPageScrolled(position, 0.0f, 0);
  }

}
