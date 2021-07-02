package edu.nkotlin.databinding;
import edu.nkotlin.R;
import edu.nkotlin.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailBindingImpl extends ActivityDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_hero, 5);
        sViewsWithIds.put(R.id.tv_title_alter_ego, 6);
        sViewsWithIds.put(R.id.tv_title_bio, 7);
        sViewsWithIds.put(R.id.tv_title_power, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.RatingBar) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rbShowRating.setTag(null);
        this.tvDetailsAlterEgo.setTag(null);
        this.tvDetailsBio.setTag(null);
        this.tvHeroName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.superhero == variableId) {
            setSuperhero((edu.nkotlin.Superhero) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSuperhero(@Nullable edu.nkotlin.Superhero Superhero) {
        this.mSuperhero = Superhero;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.superhero);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        float superheroPower = 0f;
        java.lang.String superheroAlterEgo = null;
        java.lang.String superheroBio = null;
        java.lang.String superheroName = null;
        edu.nkotlin.Superhero superhero = mSuperhero;

        if ((dirtyFlags & 0x3L) != 0) {



                if (superhero != null) {
                    // read superhero.power
                    superheroPower = superhero.getPower();
                    // read superhero.alterEgo
                    superheroAlterEgo = superhero.getAlterEgo();
                    // read superhero.bio
                    superheroBio = superhero.getBio();
                    // read superhero.name
                    superheroName = superhero.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.RatingBarBindingAdapter.setRating(this.rbShowRating, superheroPower);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDetailsAlterEgo, superheroAlterEgo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDetailsBio, superheroBio);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeroName, superheroName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): superhero
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}