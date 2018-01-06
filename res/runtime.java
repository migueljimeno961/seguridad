if (ContextCompat.checkSelfPermission(thisActivity,
Manifest.permission.WRITE_CALENDAR) != PackageManager.PERMISSION_GRANTED) {
// permission wasn't granted, show error message and exit
}
// granted permission, continue
