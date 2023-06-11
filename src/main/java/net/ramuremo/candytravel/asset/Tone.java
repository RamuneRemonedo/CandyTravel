package net.ramuremo.candytravel.asset;

public enum Tone {
    F_0 (0.00f),
    G_0 (0.53f),
    Gs_0(0.56f),
    A_0 (0.60f),
    As_0(0.63f),
    B_0 (0.67f),
    C_1  (0.70f),
    Cs_1(0.75f),
    D_1 (0.80f),
    Ds_1(0.85f),
    E_1 (0.90f),
    F_1 (0.95f),
    Fs_1(1.00f),
    G_1 (1.05f),
    Gs_1(1.10f),
    A_1 (1.20f),
    As_1(1.25f),
    B_1 (1.32f),
    C_2 (1.40f),
    Cs_2(1.50f),
    D_2 (1.60f),
    Ds_2(1.70f),
    E_2 (1.80f),
    F_2 (1.90f),
    Fs_2(2.00f);

    private final float pitch;

    Tone(float pitch) {
        this.pitch = pitch;
    }

    public float getPitch() {
        return pitch;
    }
}