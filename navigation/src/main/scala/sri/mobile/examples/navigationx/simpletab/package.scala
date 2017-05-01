package sri.mobile.examples.navigationx

import sri.navigation._
import sri.platform._
import sri.navigation.navigators._
import sri.universal.styles.UniversalStyleSheet
import sri.vector.icons.{Ionicons, IoniconsList}
package object simpletab {

  val root = TabNavigator(
    TabNavigatorConfig(
      tabBarOptions = TabBarOptions(
        activeTintColor = if (SriPlatform.isIOS) "#e91e63" else "#fff")
    ),
    registerTabScreen[HomeScreen](
      navigationOptions = NavigationTabScreenOptions(
        tabBarIcon = (iconOptions: IconOptions) => {
          Ionicons(
            name =
              if (SriPlatform.isAndroid) IoniconsList.IOS_HOME
              else IoniconsList.IOS_HOME_OUTLINE,
            size = 27,
            style = UniversalStyleSheet.style(registerStyle = false,
                                              color = iconOptions.tintColor)
          )
        },
        tabBarLabel = "Home"
      )),
    registerTabScreen[SettingsScreen](
      navigationOptions = NavigationTabScreenOptions(
        tabBarIcon = (iconOptions: IconOptions) => {
          Ionicons(
            name =
              if (iconOptions.focused) IoniconsList.IOS_SETTINGS
              else IoniconsList.IOS_SETTINGS_OUTLINE,
            size = 27,
            style = UniversalStyleSheet.style(registerStyle = false,
                                              color = iconOptions.tintColor)
          )
        },
        tabBarLabel = "Settings"
      )),
    registerTabScreen[ChatScreen](
      navigationOptions = NavigationTabScreenOptions(
        tabBarIcon = (iconOptions: IconOptions) => {
          Ionicons(
            name =
              if (iconOptions.focused) IoniconsList.IOS_CHATBOXES
              else IoniconsList.IOS_CHATBOXES_OUTLINE,
            size = 27,
            style = UniversalStyleSheet.style(registerStyle = false,
                                              color = iconOptions.tintColor)
          )
        },
        tabBarLabel = "Chat"
      )),
    registerTabScreen[PeopleScreen](
      navigationOptions = NavigationTabScreenOptions(
        tabBarIcon = (iconOptions: IconOptions) => {
          Ionicons(
            name =
              if (iconOptions.focused) IoniconsList.IOS_PEOPLE
              else IoniconsList.IOS_PEOPLE_OUTLINE,
            size = 27,
            style = UniversalStyleSheet.style(registerStyle = false,
                                              color = iconOptions.tintColor)
          )
        },
        tabBarLabel = "People"
      ))
  )
}
