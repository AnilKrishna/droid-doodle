package com.challenge.svakt.droiddoodle;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.pes.androidmaterialcolorpickerdialog.ColorPicker;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by svakt on 16/04/2017.
 */

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class MainActivityTest {
    @Spy
    private  MainActivity mMainActivityPresenter = new MainActivity();

    // Objects to be mocked
    private DrawingDoodle mockDrawingDoodle;
    private ColorPicker mockColorPicker;
    private View mockCanvasView;
    private Toast mockToast;
    private WallpaperManager mockWallPaperManager;
    private Canvas mockCanvas;
    private Bitmap mockBitmap;
    private MotionEvent mockMotionEvent;
    private MainActivity mockMainActivity;

    @Before
    public void setUp() throws Throwable{
        // Mockito has a very convenient way to inject mocks by using the @Mock annotation. To
        // inject the mocks in the test the initMocks method needs to be called.
        //MockitoAnnotations.initMocks(this);

        // Get a reference to the objects under test
        mockDrawingDoodle = mock(DrawingDoodle.class);
        mockColorPicker = mock(ColorPicker.class);
        mockCanvasView = mock(View.class);
        mockToast = mock(Toast.class);
        mockWallPaperManager = mock(WallpaperManager.class);
        mockCanvas = mock(Canvas.class);
        mockBitmap = mock(Bitmap.class);
        mockMotionEvent = mock(MotionEvent.class);
        mockMainActivity = mock(MainActivity.class);
    }

    @Test
    public void test_SaveToGallery() throws Exception {
        //When
        mockMainActivity.saveCanvasToGallery(mockCanvasView);
        //Then
        verify(mockMainActivity).saveCanvasToGallery(mockCanvasView);
    }

    @Test
    public void test_SetAsWallpaper() throws Exception {
        //When
        mockMainActivity.setCanvasWallPaper(mockCanvasView);
        //Then
        verify(mockMainActivity).setCanvasWallPaper(mockCanvasView);
    }

    @Test
    public void test_ClearCanvas() throws Exception {
        //When
        mockMainActivity.clearCanvas(mockCanvasView);
        //Then
        verify(mockMainActivity).clearCanvas(mockCanvasView);
    }

    @Test
    public void test_ChangeCanvasBackground() throws Exception {
        //When
        mockMainActivity.canvasColorClicked(mockCanvasView);
        //Then
        verify(mockMainActivity).canvasColorClicked(mockCanvasView);
    }

    @Test
    public void test_PaintColorChange() throws Exception {
        //When
        mockMainActivity.paintClicked(mockCanvasView);
        //Then
        verify(mockMainActivity).paintClicked(mockCanvasView);
    }

    @Test
    public void test_CheckAndRequestPermissions() throws Exception {
        //When
        mockMainActivity.checkAndRequestPermissions();
        //Then
        verify(mockMainActivity).checkAndRequestPermissions();
    }

    @Test
    public void test_ShowsColorPicker() throws Exception {
        //When
        mockColorPicker.show();
        //Then
        verify(mockColorPicker).show();
    }

    @Test
    public void test_DismissColorPicker() throws Exception {
        //When
        mockColorPicker.dismiss();
        //Then
        verify(mockColorPicker).dismiss();
    }

    @Test
    public void test_ResetCanvas() throws Exception {
        //When
        mockDrawingDoodle.resetCanvas();
        //Then
        verify(mockDrawingDoodle).resetCanvas();
    }

    @Test
    public void test_OnDraw() throws Exception {
        //When
        mockDrawingDoodle.draw(mockCanvas);
        //Then
        verify(mockDrawingDoodle).draw(mockCanvas);
    }

    @Test
    public void test_ToastShow() throws Exception {
        //When
        mockToast.show();
        //Then
        verify(mockToast).show();
    }

    @Test
    public void test_SetWallPaper() throws Exception{
        //when
        mockWallPaperManager.setBitmap(mockBitmap);
        //Then
        verify(mockWallPaperManager).setBitmap(mockBitmap);
    }

    @Test
    public void test_OnMotionEvent() throws Exception {
        //when
        mockDrawingDoodle.onTouchEvent(mockMotionEvent);
        // Then
        verify(mockDrawingDoodle).onTouchEvent(mockMotionEvent);
    }

    @Test
    public void test_Invalidate() throws Exception {
        //when
        mockDrawingDoodle.invalidate();
        //Then
        verify(mockDrawingDoodle).invalidate();
    }
}
