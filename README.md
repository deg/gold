# Gold

## Introduction

Gold is a wrapper around CSS Grid Layout

### Why "Gold"?

This is the next in my slowly growing series of libraries named after elements. See also
[Sodium](https://github.com/deg/sodium) and [Iron](https://github.com/deg/iron).

### State of this project

Gold is still a early work in progress. I am using it to help me with other projects
and have only addded functionality that I need and can test.  Gold will only grow as
it helps me (or other contributers) accomplish what they need. If you need features now,
PRs are welcome.

## Setup

[![Clojars Project](https://img.shields.io/clojars/v/com.degel/gold.svg)](https://clojars.org/com.degel/gold)
[![Dependencies Status](https://versions.deps.co/deg/gold/status.svg)](https://versions.deps.co/deg/gold)

Gold is ... . Setup requires a couple of steps:

- Your project.clj should include a dependency on Gold: `[com.degel/gold "0.1.0"]`
  (Or, copy the clojars label above, if I forgot to update this line!)


If you want to contribute to this project, you will want to test your changes. You can
extend the (very minimal) tests inside Gold, but you will probably need to really test
by using Gold in a ClojureScript project. The easiest way to do this, while you are
changing Gold, is by using Leiningen's
[checkouts directory](https://github.com/technomancy/leiningen/blob/master/doc/TUTORIAL.md#checkout-dependencies)
feature by sym-linking directly to your copy of Gold.

## Using Gold

Gold is a library, with a grab-bag of functions to enhance the usability of CSS Grid
Layout. You can use it in several ways:

### Testing

`lein doo phantom test auto` will run the few unit tests I've written so far. More are
needed. PRs especially welcome here.

## Useful references

- https://semantic-ui.com/
- https://react.semantic-ui.com/introduction
- https://github.com/Semantic-Org/Semantic-UI-React
- https://github.com/gadfly361/soda-ashsoda


## Questions

I can usually be found on the [Clojurians Slack](https://clojurians.net) #reagent or
#re-frame slack channels. My handle is @deg. Email is also fine.

## License

Copyright © 2018, David Goldfarb <deg@degel.com>

Licensed under the Eclipse Public License.
