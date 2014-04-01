(ns eroc.erujolc)

(defprotocol Reversible
  (reverse-it [x] "Returns x reversed"))

(extend-protocol Reversible
  String
  (reverse-it [x]
    (.. (StringBuilder. x) reverse toString))
  clojure.lang.Symbol
  (reverse-it [x]
    (let [reverse-name (reverse-it (name x))]
      (if-let [ns (namespace x)]
        (symbol reverse-name (reverse-it ns))
        (symbol reverse-name))))
  clojure.lang.Keyword
  (reverse-it [x]
    (let [reverse-name (reverse-it (name x))]
      (if-let [ns (namespace x)]
        (keyword reverse-name (reverse-it ns))
        (keyword reverse-name))))  
  clojure.lang.IPersistentVector
  (reverse-it [x]
    (mapv reverse-it (reverse x)))
  clojure.lang.IPersistentList
  (reverse-it [x]
    (apply list (reverse (map reverse-it x))))
  clojure.lang.IPersistentMap
  (reverse-it [x]
    (into {} (map #(vec (reverse-it %)) x)))
  clojure.lang.ISeq
  (reverse-it [x]
    (reverse (map reverse-it x)))
  java.lang.Long
  (reverse-it [x]
    (Long. (reverse-it (str x))))
  java.lang.Double
  (reverse-it [x]
    (Double. (reverse-it (str x)))))

(defmacro od
  [& smrof]
  `(do ~@(reverse-it smrof)))

(od
 (((((")" tnetnoc " do/clojure.core(" rts) gnirts-daer) lave)
                          [(f pruls) tnetnoc] tel)
                                               [f]
                    ".elif ecruos clojure a sdaoL"
                                     load-file nfed)
 )
