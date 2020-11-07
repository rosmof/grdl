package ro.rosmof.deploy

import org.codehaus.groovy.GroovyException


class Exasperat {
    public Exasperat() {
        throw new GroovyException("handled bad in here")
    }

    public static void print() {
        println 'Apelat in mortii lui'
    }
}