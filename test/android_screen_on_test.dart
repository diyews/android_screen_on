import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:android_screen_on/android_screen_on.dart';

void main() {
  const MethodChannel channel = MethodChannel('android_screen_on');

  TestWidgetsFlutterBinding.ensureInitialized();

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  test('getPlatformVersion', () async {
    expect(await AndroidScreenOn.platformVersion, '42');
  });
}
