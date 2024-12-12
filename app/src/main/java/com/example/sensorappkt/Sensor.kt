package com.example.sensorappkt

import android.content.Context
import android.content.pm.PackageManager
import android.hardware.Sensor

class Sensor (context: Context) : AndroidSensor(context = context, sensorFeature = PackageManager.FEATURE_SENSOR_LIGHT, sensorType = Sensor.TYPE_LIGHT)

class proximitySensor (context: Context) : AndroidSensor(context = context, sensorFeature = PackageManager.FEATURE_SENSOR_PROXIMITY, sensorType = Sensor.TYPE_PROXIMITY)
