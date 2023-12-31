package com.adoyo.blogmultiplatform.pages.admin

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.adoyo.blogmultiplatform.models.Theme
import com.adoyo.blogmultiplatform.style.LogincomponentStyle
import com.adoyo.blogmultiplatform.util.Constants.FONT_FAMILY
import com.adoyo.blogmultiplatform.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.outline
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Input

@Page
@Composable
fun Login() {

    var errorText by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.padding(leftRight = 50.px, top = 80.px, bottom = 24.px).background(
                Theme.LightGray.rgb
            ),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.width(100.px).margin(bottom = 50.px),
                src = Res.Image.logo,
                desc = "Logo"
            )
            Input(
                type = InputType.Text,
                attrs = LogincomponentStyle.toModifier().margin(bottom = 12.px).width(350.px).height(54.px)
                    .padding(leftRight = 20.px).backgroundColor(Colors.White).fontSize(14.px).outline(
                        width = 0.px, style = LineStyle.None, color = Colors.Transparent
                    ).toAttrs {
                        attr("placeHolder", "Username")
                    })

            Input(
                type = InputType.Password,
                attrs = LogincomponentStyle.toModifier().margin(bottom = 20.px).width(350.px).height(54.px)
                    .padding(leftRight = 20.px).backgroundColor(Colors.White).outline(
                        width = 0.px, style = LineStyle.None, color = Colors.Transparent
                    ).toAttrs {
                    attr("placeHolder", "Password")
                })
            Button(
                attrs = Modifier.width(350.px).height(54.px).backgroundColor(Theme.Primary.rgb)
                    .color(Colors.White).borderRadius(r = 4.px).fontWeight(FontWeight.Medium)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(14.px)
                    .border(
                        width = 0.px, style = LineStyle.None, color = Colors.Transparent
                    ).outline(
                        width = 0.px, style = LineStyle.None, color = Colors.Transparent
                    ).toAttrs()
            ) {
                SpanText(text = "Sign In")
            }
            SpanText(
                modifier = Modifier.width(350.px).color(Colors.Red).textAlign(TextAlign.Center),
                text = errorText
            )
        }
    }

}