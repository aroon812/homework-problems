/* This file was generated by SableCC (http://www.sablecc.org/). */

package minijava.node;

import minijava.analysis.*;

@SuppressWarnings("nls")
public final class AAndExp extends PExp
{
    private PExp _exp_;
    private TAnd _and_;
    private PLessthan _lessthan_;

    public AAndExp()
    {
        // Constructor
    }

    public AAndExp(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TAnd _and_,
        @SuppressWarnings("hiding") PLessthan _lessthan_)
    {
        // Constructor
        setExp(_exp_);

        setAnd(_and_);

        setLessthan(_lessthan_);

    }

    @Override
    public Object clone()
    {
        return new AAndExp(
            cloneNode(this._exp_),
            cloneNode(this._and_),
            cloneNode(this._lessthan_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAndExp(this);
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TAnd getAnd()
    {
        return this._and_;
    }

    public void setAnd(TAnd node)
    {
        if(this._and_ != null)
        {
            this._and_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._and_ = node;
    }

    public PLessthan getLessthan()
    {
        return this._lessthan_;
    }

    public void setLessthan(PLessthan node)
    {
        if(this._lessthan_ != null)
        {
            this._lessthan_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lessthan_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._and_)
            + toString(this._lessthan_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._and_ == child)
        {
            this._and_ = null;
            return;
        }

        if(this._lessthan_ == child)
        {
            this._lessthan_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._and_ == oldChild)
        {
            setAnd((TAnd) newChild);
            return;
        }

        if(this._lessthan_ == oldChild)
        {
            setLessthan((PLessthan) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
