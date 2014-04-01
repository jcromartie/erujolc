(ns erujolc.core-test
  (:require [clojure.test :refer :all]
            [eroc.erujolc :refer :all]))

(deftest test-od
  (is (= (ns-publics 'clojure.core)
         (od ((eroc.erujolc etouq) scilbup-sn)))))

(deftest test-loading
  (is (nil? (eroc.erujolc/elif-daol "test/jlc.tset")))
  (is (= [3 2 1]) (:x @(resolve 'foo))))
