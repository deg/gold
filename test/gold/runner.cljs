(ns gold.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [gold.utils-test]
              [gold.core-test]))

(doo-tests 'gold.utils-test
           'gold.core-test)
