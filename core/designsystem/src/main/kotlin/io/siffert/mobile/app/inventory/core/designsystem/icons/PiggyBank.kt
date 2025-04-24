package io.siffert.mobile.app.inventory.core.designsystem.icons

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.siffert.mobile.app.inventory.core.designsystem.theme.Cozy
import io.siffert.mobile.app.inventory.core.designsystem.theme.InventoryIcons

val InventoryIcons.PiggyBank by lazy { InventoryIcons.getPiggyBank(Color.Black) }

@Suppress("UnusedReceiverParameter", "LongMethod")
private fun InventoryIcons.getPiggyBank(iconColor: Color) =
    ImageVector.Builder(
        name = "PiggyBank",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = null,
            fillAlpha = 1.0f,
            stroke = SolidColor(iconColor),
            strokeAlpha = 1.0f,
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19f, 5f)
            curveToRelative(-1.5f, 0f, -2.8f, 1.4f, -3f, 2f)
            curveToRelative(-3.5f, -1.5f, -11f, -0.3f, -11f, 5f)
            curveToRelative(0f, 1.8f, 0f, 3f, 2f, 4.5f)
            verticalLineTo(20f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-4f)
            curveToRelative(1f, -0.5f, 1.7f, -1f, 2f, -2f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(-2f)
            curveToRelative(0f, -1f, -0.5f, -1.5f, -1f, -2f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = null,
            fillAlpha = 1.0f,
            stroke = SolidColor(iconColor),
            strokeAlpha = 1.0f,
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 9f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(1f)
        }
        path(
            fill = null,
            fillAlpha = 1.0f,
            stroke = SolidColor(iconColor),
            strokeAlpha = 1.0f,
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16f, 11f)
            horizontalLineToRelative(0.01f)
        }
    }.build()

@Preview
@Composable
internal fun PiggyBankPreviewDefault() = Icon(Cozy.icon.PiggyBank, contentDescription = null)
