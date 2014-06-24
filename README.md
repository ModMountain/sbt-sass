sbt-sass for play framework 2.3
========
Plugin based on [play-sass][play-sass] for Play Framework 2.2.x 

## ver 0.1.1 [24-06-2014]
* Added output directory customization
* Fix for windows using
* Sass sources directory changed from `app/assets/*` to `app/public/*`

# Prerequisites
[Sass][sass] compiler needs to be installed for plugin to work. This means that `sass` executable
needs to be found in path. Sass can be installed by by installing `sass` gem.
```
gem install sass
```
You can verify that `sass` has been installed by following command:
```
% sass -v
```
Also you should install (optional) compass if you want to use it
```
gem install compass
```

# Installation
## External GitHub repository (Recommended)
1. Add line to `project/plugins.sbt`
   ```
   resolvers += Resolver.url("GitHub repository", url("http://shaggyyeti.github.io/releases"))(Resolver.ivyStylePatterns)

   addSbtPlugin("default" % "sbt-sass" % "0.1.1")
   ```
2. Run `activator`

## Compilation from sources
1. Clone from this repo
   ```
   git clone https://github.com/ShaggyYeti/sbt-sass.git
   ```
2. Enter to folder with sbt-sass and run `sbt`
3. In sbt-console execute command `publishLocal`
4. Add line in your play project to project/plugins.sbt
   ```
   addSbtPlugin("default" % "sbt-sass" % "0.1")
   ```
5. Run `activator`

# Usage
* `*.sass` and `*.scss` files in `app/public/*` directories will be automatically compiled to `*.css` files.
* Files starting with `_`-character will be left out from compilation as per Play convention.
* By default output directory is sass:
  ```
  <link rel="stylesheet" media="screen" href="@routes.Assets.at("sass/test.css")">
  ```
* If you want to set output directory = `css`, then add to `build.sbt` next line:
```
sassPublicDir in Assets := "css" 
```
and include in templates:
```
<link rel="stylesheet" media="screen" href="@routes.Assets.at("sass/test.css")">
```

Example of play-project: [example][example]

## Compass (optional)
If u want to use [compass][compass] just add next line in `build.sbt`:
```
sassOptions in Assets ++= Seq("--compass", "-r", "compass")
```
[play-sass]: https://github.com/jlitola/play-sass
[sass]: http://sass-lang.com/
[compass]: http://compass-style.org/
[example]: https://github.com/ShaggyYeti/play-sass-example
