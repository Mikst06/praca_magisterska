package ug.master.mstempin.pattern.command;

import ug.master.mstempin.pattern.command.editor.Editor_10;
import ug.master.mstempin.pattern.command.editor.Editor_15;
import ug.master.mstempin.pattern.command.editor.Editor_3;
import ug.master.mstempin.pattern.command.editor.Editor_5;
import ug.master.mstempin.pattern.command.without.editor.Editor_10W;
import ug.master.mstempin.pattern.command.without.editor.Editor_15W;
import ug.master.mstempin.pattern.command.without.editor.Editor_3W;
import ug.master.mstempin.pattern.command.without.editor.Editor_5W;
import ug.master.mstempin.pattern.command.without.model.editor_10W.Command_AW_10;
import ug.master.mstempin.pattern.command.without.model.editor_10W.Command_BW_10;
import ug.master.mstempin.pattern.command.without.model.editor_10W.Command_CW_10;
import ug.master.mstempin.pattern.command.without.model.editor_10W.Command_DW_10;
import ug.master.mstempin.pattern.command.without.model.editor_10W.Command_EW_10;
import ug.master.mstempin.pattern.command.without.model.editor_10W.Command_FW_10;
import ug.master.mstempin.pattern.command.without.model.editor_10W.Command_GW_10;
import ug.master.mstempin.pattern.command.without.model.editor_10W.Command_HW_10;
import ug.master.mstempin.pattern.command.without.model.editor_10W.Command_IW_10;
import ug.master.mstempin.pattern.command.without.model.editor_10W.Command_JW_10;
import ug.master.mstempin.pattern.command.without.model.editor_15W.Command_AW_15;
import ug.master.mstempin.pattern.command.without.model.editor_15W.Command_BW_15;
import ug.master.mstempin.pattern.command.without.model.editor_15W.Command_CW_15;
import ug.master.mstempin.pattern.command.without.model.editor_15W.Command_DW_15;
import ug.master.mstempin.pattern.command.without.model.editor_15W.Command_EW_15;
import ug.master.mstempin.pattern.command.without.model.editor_15W.Command_FW_15;
import ug.master.mstempin.pattern.command.without.model.editor_15W.Command_GW_15;
import ug.master.mstempin.pattern.command.without.model.editor_15W.Command_HW_15;
import ug.master.mstempin.pattern.command.without.model.editor_15W.Command_IW_15;
import ug.master.mstempin.pattern.command.without.model.editor_15W.Command_JW_15;
import ug.master.mstempin.pattern.command.without.model.editor_15W.Command_KW_15;
import ug.master.mstempin.pattern.command.without.model.editor_15W.Command_LW_15;
import ug.master.mstempin.pattern.command.without.model.editor_15W.Command_MW_15;
import ug.master.mstempin.pattern.command.without.model.editor_15W.Command_NW_15;
import ug.master.mstempin.pattern.command.without.model.editor_15W.Command_OW_15;
import ug.master.mstempin.pattern.command.without.model.editor_3W.Command_AW_3;
import ug.master.mstempin.pattern.command.without.model.editor_3W.Command_BW_3;
import ug.master.mstempin.pattern.command.without.model.editor_3W.Command_CW_3;
import ug.master.mstempin.pattern.command.without.model.editor_5W.Command_AW_5;
import ug.master.mstempin.pattern.command.without.model.editor_5W.Command_BW_5;
import ug.master.mstempin.pattern.command.without.model.editor_5W.Command_CW_5;
import ug.master.mstempin.pattern.command.without.model.editor_5W.Command_DW_5;
import ug.master.mstempin.pattern.command.without.model.editor_5W.Command_EW_5;

public class CommandService {
    private static CommandService instance;

    public static CommandService getInstance() {
        if ( instance == null ) {
            instance = new CommandService();
        }
        return instance;
    }

    public void _300KB_WithCommand(){
        Editor_3 editor = new Editor_3();
        editor.init(new byte[300000]);
    }

    public void _300KB_WithoutCommand(){
        Editor_3W editor = new Editor_3W();
        editor.init(new byte[300000]);

        Command_AW_3 command_aw = new Command_AW_3(editor);
        Command_BW_3 command_bw = new Command_BW_3(editor);
        Command_CW_3 command_cw = new Command_CW_3(editor);

        command_aw.execute();
        command_bw.execute();
        command_cw.execute();
    }

    public void _500KB_WithCommand(){
        Editor_3 editor = new Editor_3();
        editor.init(new byte[500000]);
    }

    public void _500KB_WithoutCommand(){
        Editor_3W editor = new Editor_3W();
        editor.init(new byte[500000]);

        Command_AW_3 command_aw = new Command_AW_3(editor);
        Command_BW_3 command_bw = new Command_BW_3(editor);
        Command_CW_3 command_cw = new Command_CW_3(editor);

        command_aw.execute();
        command_bw.execute();
        command_cw.execute();
    }

    public void _800KB_WithCommand(){
        Editor_3 editor = new Editor_3();
        editor.init(new byte[800000]);
    }

    public void _800KB_WithoutCommand(){
        Editor_3W editor = new Editor_3W();
        editor.init(new byte[800000]);

        Command_AW_3 command_aw = new Command_AW_3(editor);
        Command_BW_3 command_bw = new Command_BW_3(editor);
        Command_CW_3 command_cw = new Command_CW_3(editor);

        command_aw.execute();
        command_bw.execute();
        command_cw.execute();
    }

    //--------------------------------------------------------------------------------------------------------

    public void _800KB_WithCommand_5level(){
        Editor_5 editor = new Editor_5();
        editor.init(new byte[800000]);
    }

    public void _800KB_WithoutCommand_5level(){
        Editor_5W editor = new Editor_5W();
        editor.init(new byte[800000]);

        Command_AW_5 command_aw = new Command_AW_5(editor);
        Command_BW_5 command_bw = new Command_BW_5(editor);
        Command_CW_5 command_cw = new Command_CW_5(editor);
        Command_DW_5 command_dw = new Command_DW_5(editor);
        Command_EW_5 command_ew = new Command_EW_5(editor);

        command_aw.execute();
        command_bw.execute();
        command_cw.execute();
        command_dw.execute();
        command_ew.execute();
    }

    public void _800KB_WithCommand_10level(){
        Editor_10 editor = new Editor_10();
        editor.init(new byte[800000]);
    }

    public void _800KB_WithoutCommand_10level(){
        Editor_10W editor = new Editor_10W();
        editor.init(new byte[800000]);

        Command_AW_10 command_aw = new Command_AW_10(editor);
        Command_BW_10 command_bw = new Command_BW_10(editor);
        Command_CW_10 command_cw = new Command_CW_10(editor);
        Command_DW_10 command_dw = new Command_DW_10(editor);
        Command_EW_10 command_ew = new Command_EW_10(editor);
        Command_FW_10 command_fw = new Command_FW_10(editor);
        Command_GW_10 command_gw = new Command_GW_10(editor);
        Command_HW_10 command_hw = new Command_HW_10(editor);
        Command_IW_10 command_iw = new Command_IW_10(editor);
        Command_JW_10 command_jw = new Command_JW_10(editor);

        command_aw.execute();
        command_bw.execute();
        command_cw.execute();
        command_dw.execute();
        command_ew.execute();
        command_fw.execute();
        command_gw.execute();
        command_hw.execute();
        command_iw.execute();
        command_jw.execute();
    }

    public void _800KB_WithCommand_15level(){
        Editor_15 editor = new Editor_15();
        editor.init(new byte[800000]);
    }

    public void _800KB_WithoutCommand_15level(){
        Editor_15W editor = new Editor_15W();
        editor.init(new byte[800000]);

        Command_AW_15 command_aw = new Command_AW_15(editor);
        Command_BW_15 command_bw = new Command_BW_15(editor);
        Command_CW_15 command_cw = new Command_CW_15(editor);
        Command_DW_15 command_dw = new Command_DW_15(editor);
        Command_EW_15 command_ew = new Command_EW_15(editor);
        Command_FW_15 command_fw = new Command_FW_15(editor);
        Command_GW_15 command_gw = new Command_GW_15(editor);
        Command_HW_15 command_hw = new Command_HW_15(editor);
        Command_IW_15 command_iw = new Command_IW_15(editor);
        Command_JW_15 command_jw = new Command_JW_15(editor);
        Command_KW_15 command_kw = new Command_KW_15(editor);
        Command_LW_15 command_lw = new Command_LW_15(editor);
        Command_MW_15 command_mw = new Command_MW_15(editor);
        Command_NW_15 command_nw = new Command_NW_15(editor);
        Command_OW_15 command_ow = new Command_OW_15(editor);

        command_aw.execute();
        command_bw.execute();
        command_cw.execute();
        command_dw.execute();
        command_ew.execute();
        command_fw.execute();
        command_gw.execute();
        command_hw.execute();
        command_iw.execute();
        command_jw.execute();
        command_kw.execute();
        command_lw.execute();
        command_mw.execute();
        command_nw.execute();
        command_ow.execute();
    }
}
