grilled-feta
============

Google App Engine, Jersey, AngularJS, Bootstrap baked with IntelliJ

dev setup (intelij)
============
* git clone github:robertjchristian/grilled-feta
* open IntelliJ
* open project
* select grilled-feta directory

dev debug (intelij)
============
* Run -> Edit Configurations...
* Click "+" and select Google AppEngine Dev Server
* Apply / Ok
* Click green play button from top menu
* Browser pointing to localhost:8080 will open automatically


dev deploy (intelij)
============
* Tools -> Upload App Engine Application
* Edit appengine-web.xml to point to your google app engine application and version:  <pre>
<?xml version="1.0" encoding="utf-8"?>
<appengine-web-app xmlns="http://appengine.google.com/ns/1.0">
    <application>grilled-feta</application>
    <version>1</version>
    <threadsafe>true</threadsafe>
</appengine-web-app> 
</pre>
* Enter google app engine login and password
