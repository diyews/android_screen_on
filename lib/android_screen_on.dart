import 'dart:async';

import 'package:flutter/services.dart';

class AndroidScreenOn {
  static const MethodChannel _channel =
      const MethodChannel('android_screen_on');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }

  static Future<void> turnOn() async {
    await _channel.invokeMethod("turnOn");
  }

  static Future<void> keepRunOnScreenOff() async {
    await _channel.invokeMethod("keepRunOnScreenOff");
  }

  static Future<void> lock() async {
    await _channel.invokeMethod("lock");
  }
}
