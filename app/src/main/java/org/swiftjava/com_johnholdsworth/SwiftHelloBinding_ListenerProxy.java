
/// generated by: genswift.java 'java/lang|java/util|java/sql' 'Sources' '../java' ///

/// interface com.johnholdsworth.swiftbindings.SwiftHelloBinding$Listener ///

package org.swiftjava.com_johnholdsworth;

@SuppressWarnings("JniMissingFunction")
public class SwiftHelloBinding_ListenerProxy implements com.johnholdsworth.swiftbindings.SwiftHelloBinding.Listener {

    // address of proxy object
    long __swiftObject;

    SwiftHelloBinding_ListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Listener.drawPoint(int,int)

    public native void __drawPoint( long __swiftObject, int x, int y );

    public void drawPoint( int x, int y ) {
        __drawPoint( __swiftObject, x, y );
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Listener.processNumber(double)

    public native void __processNumber( long __swiftObject, double number );

    public void processNumber( double number ) {
        __processNumber( __swiftObject, number );
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Listener.processStringMap(com.johnholdsworth.swiftbindings.SwiftHelloTypes$StringMap)

    public native void __processStringMap( long __swiftObject, com.johnholdsworth.swiftbindings.SwiftHelloTypes.StringMap map );

    public void processStringMap( com.johnholdsworth.swiftbindings.SwiftHelloTypes.StringMap map ) {
        __processStringMap( __swiftObject, map );
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Listener.processStringMapList(com.johnholdsworth.swiftbindings.SwiftHelloTypes$StringMapList)

    public native void __processStringMapList( long __swiftObject, com.johnholdsworth.swiftbindings.SwiftHelloTypes.StringMapList map );

    public void processStringMapList( com.johnholdsworth.swiftbindings.SwiftHelloTypes.StringMapList map ) {
        __processStringMapList( __swiftObject, map );
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Listener.processText(java.lang.String)

    public native void __processText( long __swiftObject, java.lang.String text );

    public void processText( java.lang.String text ) {
        __processText( __swiftObject, text );
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Listener.processedMap(com.johnholdsworth.swiftbindings.SwiftHelloTypes$ListenerMap)

    public native void __processedMap( long __swiftObject, com.johnholdsworth.swiftbindings.SwiftHelloTypes.ListenerMap map );

    public void processedMap( com.johnholdsworth.swiftbindings.SwiftHelloTypes.ListenerMap map ) {
        __processedMap( __swiftObject, map );
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Listener.processedMapList(com.johnholdsworth.swiftbindings.SwiftHelloTypes$ListenerMapList)

    public native void __processedMapList( long __swiftObject, com.johnholdsworth.swiftbindings.SwiftHelloTypes.ListenerMapList map );

    public void processedMapList( com.johnholdsworth.swiftbindings.SwiftHelloTypes.ListenerMapList map ) {
        __processedMapList( __swiftObject, map );
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Listener.setCacheDir(java.lang.String)

    public native void __setCacheDir( long __swiftObject, java.lang.String cacheDir );

    public void setCacheDir( java.lang.String cacheDir ) {
        __setCacheDir( __swiftObject, cacheDir );
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Listener.setupImage(int,int)

    public native void __setupImage( long __swiftObject, int width, int height );

    public void setupImage( int width, int height ) {
        __setupImage( __swiftObject, width, height );
    }

    /// public abstract com.johnholdsworth.swiftbindings.SwiftHelloTest$TestListener com.johnholdsworth.swiftbindings.SwiftHelloBinding$Listener.testResponder(int)

    public native com.johnholdsworth.swiftbindings.SwiftHelloTest.TestListener __testResponder( long __swiftObject, int loopback );

    public com.johnholdsworth.swiftbindings.SwiftHelloTest.TestListener testResponder( int loopback ) {
        return __testResponder( __swiftObject, loopback );
    }

    /// public abstract double com.johnholdsworth.swiftbindings.SwiftHelloBinding$Listener.throwException() throws java.lang.Exception

    public native double __throwException( long __swiftObject );

    public double throwException() throws java.lang.Exception {
        return __throwException( __swiftObject  );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
