(ns simpleexample.dev
  (:require [simpleexample.core :as example]
            [figwheel.client :as fw]))

(fw/start {:on-jsload example/mount-root
           :websocket-url "ws://localhost:3449/figwheel-ws"})
