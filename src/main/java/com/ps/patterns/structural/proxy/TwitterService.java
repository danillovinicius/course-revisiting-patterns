package com.ps.patterns.structural.proxy;

public interface TwitterService {

  String getTimeline(String screenName);

  void postToTimeline(String screenName, String message);
}
