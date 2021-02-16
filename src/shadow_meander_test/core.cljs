(ns shadow-meander-test.core
  (:require
   [meander.epsilon :as m :include-macros true]))

(defn main [& _]
  (println
   (m/rewrite [1 2 3]
     [!ks ...]
     [(m/cata !ks) ...]
     ?x ~(inc ?x))))
