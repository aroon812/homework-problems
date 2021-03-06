/* This file was generated by SableCC (http://www.sablecc.org/). */

package minijava.node;

import minijava.analysis.*;

@SuppressWarnings("nls")
public final class ANotNotexp extends PNotexp
{
    private TNot _not_;
    private PNotexp _notexp_;

    public ANotNotexp()
    {
        // Constructor
    }

    public ANotNotexp(
        @SuppressWarnings("hiding") TNot _not_,
        @SuppressWarnings("hiding") PNotexp _notexp_)
    {
        // Constructor
        setNot(_not_);

        setNotexp(_notexp_);

    }

    @Override
    public Object clone()
    {
        return new ANotNotexp(
            cloneNode(this._not_),
            cloneNode(this._notexp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANotNotexp(this);
    }

    public TNot getNot()
    {
        return this._not_;
    }

    public void setNot(TNot node)
    {
        if(this._not_ != null)
        {
            this._not_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._not_ = node;
    }

    public PNotexp getNotexp()
    {
        return this._notexp_;
    }

    public void setNotexp(PNotexp node)
    {
        if(this._notexp_ != null)
        {
            this._notexp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._notexp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._not_)
            + toString(this._notexp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._not_ == child)
        {
            this._not_ = null;
            return;
        }

        if(this._notexp_ == child)
        {
            this._notexp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._not_ == oldChild)
        {
            setNot((TNot) newChild);
            return;
        }

        if(this._notexp_ == oldChild)
        {
            setNotexp((PNotexp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
