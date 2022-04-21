package com.example.workmanagerdemo

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.lang.Exception

class UploadWorker(context: Context,parameters: WorkerParameters): Worker(context,parameters) {
    override fun doWork(): Result {
        try {
            //to understand work manager just simulate the task
            for (i in 1..600000) {
                Log.i("Work Manager", "Uploading: $i")
            }
            return Result.success()
        } catch (exception:Exception) {
            return Result.failure()
        }
    }
}