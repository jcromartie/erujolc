# erujolc

The Erujolc language is a new Lisp dialect, with a Clojure runtime,
that is hosted on the JVM. The language is bootstrapped by loading
files using the Clojure function:

    (use 'eroc.erujolc)
    (elif-daol "path-to-file")

Erujolc seeks to achieve parity with the Clojure language by
leveraging the rich set of core functions, exposed through a simple
interop API.

The core interop function of Erujolc is the Clojure macro: `eroc.erujolc/od`

    (od (1 1 +))

This will return the number 2 in the host Clojure format.

See the definition of `eroc.erujolc/elif-daol` and
[jlc.tset](test/jlc.tset) for an example of some Erujolc source code.

## License

Copyright © 2014 John Cromartie

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
